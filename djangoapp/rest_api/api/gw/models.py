from django.db import models
import datetime
import json

class Item(models.Model):
    id = models.IntegerField(primary_key=True)
    name = models.CharField(max_length=60)
    last_update = models.DateTimeField()

    def get_all_ids(self):
        from rest_api.api.gw.connect import Connect
        connection = Connect()
        connection.connect(method='get', url='https://api.guildwars2.com/v2/items')
        response = json.loads(connection.get_response().text)
        item_update = hash(response)
        return response



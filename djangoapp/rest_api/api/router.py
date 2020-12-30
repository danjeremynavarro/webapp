from rest_api.api.gw.connect import Connect
from django.http import HttpResponse
from rest_api.api.gw.models import Item

def test(request):
    # connection = Connect()
    # connection.connect(method='get', url='https://api.guildwars2.com/v2/items')
    # response = connection.get_response()
    return HttpResponse(Item().get_all_ids())
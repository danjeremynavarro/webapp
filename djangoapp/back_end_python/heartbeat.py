from django.http import JsonResponse
import datetime
import sys


def json_heartbeat(request):
    return JsonResponse({
        "message": "Im alive!!.",
        "local_time": datetime.datetime.now(),
        "utc": datetime.datetime.utcnow(),
        "platform": sys.platform
    })

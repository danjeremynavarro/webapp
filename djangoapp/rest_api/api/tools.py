from back_end_python.heartbeat import json_heartbeat
from django.http import HttpResponse


def ping(request):
    return json_heartbeat(request)


def send_as_page(request, content):
    return HttpResponse(content)


def debug(request):
    return HttpResponse(str(request.headers))

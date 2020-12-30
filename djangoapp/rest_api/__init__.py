
def send_as_page(request, content):
    from rest_api.api.tools import send_as_page as send
    return send(request, content)
from django.http import HttpResponse

def access(request):
    return HttpResponse("Not what your looking for. Visit <a href=\"http://danjeremynavarro.com\"> http://danjeremynavarro.com</a>")
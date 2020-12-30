from requests import sessions


class Connect:
    """
    Gw2 connector. Defaults to latest api.
    Returns a requests.Response object. https://github.com/psf/requests
    """

    def __init__(self):
        self._response = None

    def set_response(self, response):
        self._response = response

    def get_response(self):
        return self._response

    def connect(self, method='get', url=None, **kwargs):
        with sessions.Session() as session:
            self.set_response(session.request(method=method, url=url, **kwargs))

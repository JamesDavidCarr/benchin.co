import benchin
import unittest
from flask.ext.api import status


class BenChinTestCase(unittest.TestCase):

    def setUp(self):
        self.app = benchin.app.test_client()

    def test_hello_world(self):
        resp = self.app.get('/')
        self.assertTrue("Hello, world!" in resp.data)
        self.assertTrue(status.is_success(resp.status_code))

    def test_404(self):
        resp = self.app.get('/404')
        self.assertTrue(status.is_client_error(resp.status_code))


if __name__ == "__main__":
    unittest.main()

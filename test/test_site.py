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

    def test_hello_name(self):
        name = "James"
        resp = self.app.get('/{}'.format(name))
        self.assertTrue("Hello, James" in resp.data)
        self.assertTrue(status.is_success(resp.status_code))

    def test_404(self):
        resp = self.app.get('/404/notfound')
        self.assertTrue(status.is_client_error(resp.status_code))

    def test_fails(self):
        self.assertTrue(false)


if __name__ == "__main__":
    unittest.main()

from unittest import TestCase

from kakao.second_half.dart_game import solution


class TestSolution(TestCase):
    def test_get_solution1(self):
        result = solution("1D2S3T*")
        self.assertEquals(59, result)

    def test_get_solution2(self):
        result = solution("1T2D3D#")
        self.assertEquals(-4, result)

    def test_get_solution2(self):
        result = solution("1D#2S*3S")
        self.assertEquals(5, result)
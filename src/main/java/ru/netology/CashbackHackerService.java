package ru.netology;

public class CashbackHackerService {

        private final int boundary = 1000;

        public int remain(int amount) {
            int result = boundary - amount % boundary;

               return result;

        }

}

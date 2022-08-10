package ru.netology.unit;

public class BonusService {
    public int calculateBonus(int amount) {
        if (amount < 1000) {
            return 0;
        }

        int bonus = (amount - 1000) / 100;

        return Math.min(bonus, 100);

    }
}

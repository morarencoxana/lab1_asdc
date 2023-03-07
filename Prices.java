public enum Prices {
    PRICE_OF_EUR,
    PRICE_OF_DOLLAR,
    PRICE_OF_LEI,
    PRICE_OF_RUB;
    private static Prices[] prices = {
            PRICE_OF_EUR,
            PRICE_OF_DOLLAR,
            PRICE_OF_LEI,
            PRICE_OF_RUB
    };

    public static Prices getPrice(int num) {
        return prices[num - 1];
    }

    public int getIndex(Tovar tovar) {
        int buffer = 0;
        for (int i = 0; i < 5; i++) {
            if (tovar.getPrice().equals(prices[i])) buffer = i + 1;
        }
        return buffer;
    }


}

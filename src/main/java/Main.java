public class Main {
    public static void main(String[] args) {
        SdCard card = new SdCard();
        USB cardReader = new CardReader(card);
        cardReader.insertUsbDevice();
    }
}

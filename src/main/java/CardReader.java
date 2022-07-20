public class CardReader implements USB {

    SdCard sdCard;

    public CardReader(SdCard sdCard) {
        this.sdCard = sdCard;
    }

    @Override
    public void insertUsbDevice() {
        sdCard.insertCard();
        sdCard.readData();
    }
}

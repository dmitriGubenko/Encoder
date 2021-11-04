public class Encoder implements Encodeable{
    static final byte ENCODE_CONST = 1;

    @Override
    public String encode(String text) {
        byte[] encodeText = new byte[text.length()];
        for (int i = 0; i < text.length(); i++) {
            encodeText[i] = (byte) (text.getBytes()[i] + ENCODE_CONST);
        }
        return new String(encodeText);
    }

    @Override
    public String decode(String text) {
        byte[] encodeText = new byte[text.length()];
        for (int i = 0; i < text.length(); i++) {
            encodeText[i] = (byte) (text.getBytes()[i] - ENCODE_CONST);
        }
        return new String(encodeText);
    }
}

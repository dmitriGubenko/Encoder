public class Main {
    static final String TEXT = "Tests encoder";
    public static void main(String[] args) {
        Encodeable coder = new Encoder();
        System.out.println("Text for encode/decode: " + TEXT);
        String encodeText = coder.encode(TEXT);
        System.out.println("Encode text: " + encodeText);
        System.out.println("Decode text: " + coder.decode(encodeText));


    }
}

package tzipart1;

final class Vigenener {

    private final int bias,
            letters;

    public Vigenener(final int bias, final int letters) {
        this.bias = bias;
        this.letters = letters;
    }

    public String encrypt(final String text, final String key) {
        String encrypt = "";
        final int keyLen = key.length();
        for (int i = 0, len = text.length(); i < len; i++) {
            encrypt += (char) (((text.charAt(i) + key.charAt(i % keyLen) - 2 * this.bias) % this.letters) + this.bias);
        }
        System.out.println(encrypt);
        return encrypt;
    }

    public String decrypt(final String cipher, final String key) {
        String decrypt = "";
        final int keyLen = key.length();
        for (int i = 0, len = cipher.length(); i < len; i++) {
            decrypt += (char) (((cipher.charAt(i) - key.charAt(i % keyLen) + this.letters) % this.letters) + this.bias);
        }
        System.out.println(decrypt);
        return decrypt;
    }
}

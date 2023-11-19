package Telefon;

public  class telefon {


    private String word;

    public telefon() {
    }

    public telefon(String word) {

        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "telefon{" +
                ", word='" + word + '\'' +
                '}';
    }
}



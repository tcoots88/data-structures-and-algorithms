package code401challenges.repeatedWord;

public class RepeatedWord {
    //vars
    String[] words;
    int size;

    //cons
    public RepeatedWord(String input){
        this.words = input.toLowerCase().split("\\W+");
        this.size = this.words.length;
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String check(){
        Hashtable u = new Hashtable(getSize());
        for(String word : getWords()){

            boolean flag = u.contains(word);
            if (flag) return word;
            u.set(word, word);
        }
        return
                "No repeated words";
    }


}

//Hunter Low
public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name

    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    //pre: word does not equal null
    //post: adds word to letters
    public void add(String word){
        letters += word;

    }


    //Use Math.random() to get a random character from the letters string and return it.
    //pre: none
    //post: returns a random character from letters
    public char randomLetter(){
        return letters.charAt((int)(Math.random())*(letters.length()));
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    //pre: company does not equal null
    //post: puts company name in center of letters
    public String companyCentered(){
        return letters.substring(0,letters.length()/2) + company + letters.substring(letters.length()/2,letters.length());
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    //pre: letters contains a vowel
    //post: remove the first vowel from letters
    public void removeFirstVowel(){
        letters = letters.replaceFirst("[aeiou]","");
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    //pre: num does not exceed length of string and does not equal null
    //post: removes a certain number of letters specified from a random spot in letters
    public void removeSome(int num){
        int index = (int)(Math.random()*(letters.length()-num));
        letters = letters.substring(0,index) + letters.substring(index+num);
        
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    //pre: word is in letters
    //post: removes word from letters
    public void removeWord(String word){
        letters = letters.replaceFirst(word,"");
    }
}
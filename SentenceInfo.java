/******************************************************************************
Name: Dora Ding
Name of Lab: SentenceInfo
Due Date: 6/5/2022
Date Submitted: 6/9/2022
What I learned:
   a. I learned how to create and use class.
*******************************************************************************/
 
public class SentenceInfo {
   
   private String sentence;
   private int length, numWords;
   private double avgWordLength;

   public SentenceInfo (String sent) {
      sentence = sent;
      
      length = sentence.length();
      
      numWords = 1;
      for (int i = 0; i < sentence.length() - 1; i ++) {
         if ((sentence.charAt(i) == ' ') && (sentence.charAt(i + 1) != ' ')) {
            numWords ++;
         }
      }
   
      String sentence1 = sentence.replace(" ","");
      String sentence2 = sentence1.replace("!","");
      String sentence3 = sentence2.replace("?","");
      String sentence4 = sentence3.replace(".","");
      String sentence5 = sentence4.replace(",","");
      avgWordLength = (sentence5.length()) / (numWords);
   
   }

   public String getSentence () {
      return sentence;
   }
   
   public int getLength () {
      return length;
   }
   
   public int getNumWords () {   
      return numWords;
   }
   
   
   public double getAvgWordLength () {
      return avgWordLength;
   }
   
   public String toString () {
      return "\nSentence: " + sentence + "\nLength: " + length + "\nNumber of Words: " + numWords + "\nAverage Word Length: " + avgWordLength;
   }
            
   public static void main (String [] args) {
      SentenceInfo a = new SentenceInfo("This is great!");
      SentenceInfo b = new SentenceInfo("How are you?");
      
      System.out.println(a);
      System.out.println(b);
   }

}

/*
      ----jGRASP exec: java SentenceInfo
 
 Sentence: This is great!
 Length: 14
 Number of words: 3
 Average word length: 3.0
 
 Sentence: How are you?
 Length: 12
 Number of words: 3
 Average word length: 3.0
 
  ----jGRASP: operation complete.    
 */
public class Age {

   // Calculates and returns age
   // If currentYear is less than birthYear, it will return 0
   public static int ageCalculator(int currentYear, int birthYear) {

      int age = 0;

      if (birthYear<=currentYear) {
         age = currentYear - birthYear;
      }

      return age;
   } 

}

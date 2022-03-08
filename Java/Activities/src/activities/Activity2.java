package activities;


public class Activity2 {

    public static void main(String[] args) {
        int[] array = {10, 77, 10, 54, -11, 10};

        int search = 10;
        int maxsum = 30;

        System.out.println(result(array, search, maxsum));
    }
        public static boolean result(int[] numbers,int search,int maxsum)
        {
            int temp=0;
            for (int number: numbers) {
                if (number == search) {
                    temp = temp + search;
                }


                if (temp>maxsum)
                {
                    break;
                }
            }

            return temp == maxsum;

            }




        }

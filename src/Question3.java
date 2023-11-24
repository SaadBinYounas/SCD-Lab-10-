import java.util.Random;

public class Question3 {
    public class diceRollingGame
    {
        char arr[][]=new char[10][10];
        diceRollingGame()
        {
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=0;j<arr.length-1;j++)
                {
                    arr[i][j]='0';
                }
            }

        }
        public void iterations()
        {
            //int temp=0;
            int store=0;
            int row=0;
            int col=0;
            Random rand=new Random();
            boolean check=false;
            do{
                int value=rand.nextInt(6)+1;
                store=+value;
                if(store==90)
                {
                    arr[9][9]='x';
                    check=true;
                }
                else if(store>90)
                {
                    store=-value;
                }
                else {
                    int store1 = store;
                    while (store1 > 9) {
                        store1 = -9;
                        row++;
                    }
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++) {
                            if (arr[i][j] == arr[row][store1]) {
                                arr[i][j] = 'x';
                            }
                        }
                    }
                }
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                }

            }while(check!=false);
        }


    }

}
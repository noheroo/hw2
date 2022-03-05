package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //first exercise
        byte pen=2;
        int pencil=5;
        short books=150;
        long trees=1000000L;

        float litersWater=5.6f;
        double numberPi=3.14159265358979323;

        boolean lie=true;
        char button='$';

        //second exercise
        float boxer1=78.2f;
        float boxer2=82.7f;
        float commonWeight=boxer1+boxer2;
        float differenceWeight=boxer2-boxer1;
        System.out.println("№2. Два боксёра");
        System.out.println("Общий вес боксёров "+commonWeight+" кг");
        System.out.println("Разница в весе боксёров "+differenceWeight+" кг \n");

        //third exercise
        byte bananas=5;
        short bananaWeight=80;
        byte milk=2;
        short milkWeight=105;
        byte iceCream=2;
        short iceCreamWeight=100;
        byte egg=4;
        short eggWeight=70;

        int allBananas=bananaWeight*bananas;
        int allMilk=milkWeight*milk;
        int allIceCream=iceCreamWeight*iceCream;
        int allEgg=eggWeight*egg;
        float all=allBananas+allMilk+allIceCream+allEgg;
        float allKilo=all/1000;
        System.out.println("№3. Спорт-завтрак");
        System.out.println("Общий вес спорт-завтрака "+allKilo+" кг \n");

        //fourth exercise
        byte minusWeightKilo=7;
        short weightLossDay1=250;
        short weightLossDay2=500;
        int minusWeightGr=minusWeightKilo*1000;
        int quantityDays1=minusWeightGr/weightLossDay1;
        int quantityDays2=minusWeightGr/weightLossDay2;
        int meanMinusWeight=(weightLossDay1+weightLossDay2)/2;
        int meanDay=minusWeightGr/meanMinusWeight;

        System.out.println("№4. Сброс веса");
        System.out.println("Если худеть по "+weightLossDay1+" г в день, потребуется "+quantityDays1+" дней, чтобы похудеть на "+minusWeightKilo+" кг");
        System.out.println("Если худеть по "+weightLossDay2+" г в день, потребуется "+quantityDays2+" дней, чтобы похудеть на "+minusWeightKilo+" кг");
        System.out.println("Если в среднем худеть на "+meanMinusWeight+" г в день, то в среднем понадобится примерно "+meanDay+" дней для похудания \n");

        //fifth exercise
        int salaryMasha=67760;
        int salaryDenis=83690;
        int salaryChristina=76230;

        int yearSalaryMasha=salaryMasha*12;
        int yearSalaryDenis=salaryDenis*12;
        int yearSalaryChristina=salaryChristina*12;

        int newSalaryMasha=salaryMasha+salaryMasha/10;
        int newSalaryDenis=salaryDenis+salaryDenis/10;
        int newSalaryChristina=salaryChristina+salaryChristina/10;

        int yearNewSalaryMasha=newSalaryMasha*12;
        int yearNewSalaryDenis=newSalaryDenis*12;
        int yearNewSalaryChristina=newSalaryChristina*12;

        int differenceMasha=yearNewSalaryMasha-yearSalaryMasha;
        int differenceDenis=yearNewSalaryDenis-yearSalaryDenis;
        int differenceChristina=yearNewSalaryChristina-yearSalaryChristina;

        System.out.println("№5. ЗП");
        System.out.println("Маша будет получать "+newSalaryMasha+" руб в месяц. Годовой доход выростет на "+differenceMasha+" руб");
        System.out.println("Маша будет получать "+newSalaryDenis+" руб в месяц. Годовой доход выростет на "+differenceDenis+" руб");
        System.out.println("Маша будет получать "+newSalaryChristina+" руб в месяц. Годовой доход выростет на "+differenceChristina+" руб \n");

        //extra hw
        //№6
        int a=12;
        int b=27;
        int c=44;
        int d=15;
        int e=9;
        int result=a*(b+(c-d*e));
        result=-result;
        System.out.println("extra hw. №6. Инвертированное значение "+result+"\n");

        //№7
        int f=5;
        int g=7;
        g=f*g/g;
        f=(g*g+g+g)/g;
        System.out.println("extra hw. №7. f="+f+" ,g="+g+"\n");

        //№8
        int j=428;
        int k=j%100;
        k/=10;
        System.out.println("extra hw. №8. Цифра, которая находится в центре числа "+j+" это "+k+"\n");
    }
}

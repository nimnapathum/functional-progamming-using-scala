object functions_test_2 extends App{
    def Cels_to_fahr(c: Double):Double={
        c * 1.8 + 32.0
    }

    var celcius = 10.0;
    var fahrenheit = Cels_to_fahr(celcius);
    println(s"Celcius $celcius to Fahrenheit : $fahrenheit");
}
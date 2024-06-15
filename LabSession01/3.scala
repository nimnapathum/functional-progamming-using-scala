object functions_test_3 extends App{
    def volume_of_sphere(r: Double):Double={
        Math.PI * Math.pow(r , 3) * 4/3
    }

    var radius = 7.0;
    var volume = volume_of_sphere(radius);
    println(s"Volume of the Radius $radius sphere : $volume");
}
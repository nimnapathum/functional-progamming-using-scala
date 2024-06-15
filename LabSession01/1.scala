object functions_test_1 extends App{
    def area_of_disk(r: Double):Double = {
        Math.PI * r * r;
    }
    var radius = 7.0;
    var area = area_of_disk(radius);
    println(s"Area of the radius $radius : $area");
}
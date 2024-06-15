object functions_test_5 extends App{
    def easy(distance: Int):Int={
        distance * 8
    }

    def tempo(distance: Int):Int={
        distance * 7
    }

    var total_time = easy(2) + tempo(3) + easy(2);
    println(s"I run 2 km at an easy pace, \nthen 3 km at Tempo and 2 km at easy pace again to reach home. \nThe total running time : $total_time");
}
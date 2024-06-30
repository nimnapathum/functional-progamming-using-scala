object question01{
    def main(args: Array[String]): Unit={

        var k , i , j = 2;
        var m , n = 5;
        var f = 12.0f;
        var g = 4.0f;
        var c = 'X';

        println("Question 01------------------");
        println(s" k = i = j = $k \n m = n = $m\n f = $f\n g = $g\n c = $c\n");
        println(s" k + 12 * m = ${k + 12 * m}");
        println(s" m / j = ${m / j}");
        println(s" n % j = ${n % j}");
        println(s" m / j * j = ${m / j * j}");
        println(s" f + 10 * 5 + g = ${f + 10 * 5 + g}");
        i += 1;
        println(s" ++i * n = ${i * n}");
    }
}
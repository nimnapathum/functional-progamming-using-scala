//question 1
def area_of_disk(r: Double):Double = {
        Math.PI * r * r;
}

//question 2
def Cels_to_fahr(c: Double):Double={
        c * 1.8 + 32.0
}

//question 3
def volume_of_sphere(r: Double):Double={
        Math.PI * Math.pow(r , 3) * 4/3
}

//question 4
def discount(price: Double): Double = {
    price * 0.4
}

def cost_low(amount: Int): Double = {
    amount * 0.75
}

def cost_high(amount: Int): Double = {
    amount * 3.0
}

def net_worth(amount: Int): Double = {
    amount * 24.95
}

def find_cost(amount: Int): Double = {
    val base_price = net_worth(amount)
    if (amount <= 50) {
      base_price - cost_high(amount)
    } else {
      base_price - cost_high(50) - cost_low(amount - 50)
    }
}

def total_cost(amount: Int): Double = {
    find_cost(amount) - discount(24.95) * amount
}

//question 5
def easy(distance: Int):Int={
    distance * 8
}

def tempo(distance: Int):Int={
    distance * 7
}

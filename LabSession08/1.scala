object question_8_01{
    
    def encrypt(text: String , shifter: Int): String = {
        text.map(c => (c + shifter).toChar)
    }

    def decrypt(text: String , shifter: Int): String = {
        text.map(c => (c - shifter).toChar)
    }

    def main(args: Array[String]): Unit={
        val text = "Hello Scala"
        println(s"Original Text : ${text}")
        val encrypted_text = encrypt(text , 1) 
        println(s"Encrypted Text : ${encrypted_text}")
        println(s"Decrypted Text : ${decrypt(encrypted_text , 1)}")
    }
}
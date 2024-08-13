object question_8_01{
    
    def encrypt(text: String , shifter: Int): String = {
        text.map(c => (c + shifter).toChar)
    }

    def encrypt_alpha(text: String , shifter: Int): String = {
        text.map(c => 
            if(c.isLetter){
                val base = if (c.isUpper) 'A' else 'a'
                ((c - base + shifter) % 26 + base).toChar
            }else{
                c
            }
        )
    }

    def decrypt(text: String , shifter: Int): String = {
        text.map(c => (c - shifter).toChar)
    }

    def decrypt_alpha(text: String , shifter: Int): String = {
        text.map(c => 
            if(c.isLetter){
                val base = if (c.isUpper) 'A' else 'a'
                ((c - base - shifter) % 26 + base).toChar
            }else{
                c
            }
        )
    }

    def main(args: Array[String]): Unit={
        val text = "Hello Scala"
        println(s"Original Text : ${text}")
        val encrypted_text = encrypt_alpha(text , 1) 
        println(s"Encrypted Text : ${encrypted_text}")
        println(s"Decrypted Text : ${decrypt_alpha(encrypted_text , 1)}")
    }
}


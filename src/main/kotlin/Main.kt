fun main(args: Array<String>) {
    message()
}

fun message(){
    do {
        println("Aplikasi Kalkulator Sederhana")
        println("=============================")
        println("Pilih operasi yang akan digunakan")
        println("1. Tambah")
        println("2. Kurang")
        println("3. Kali")
        println("4. Bagi")
        println("0. Selesai")
        print("Pilih salah satu: ")
        var pilih = readln().toInt()
        if (pilih == 0){
            println("Terimakasih")
        }
        print("Masukkan nilai ke 1: ")
        var a = readln().toInt()
        print("Masukkan nilai ke 2: ")
        var b = readln().toInt()

        when (pilih){
            1 -> println("Hasil penambahan antara $a + $b adalah ${tambah(a, b)}")
            2 -> println()
            3 -> println()
            4 -> println()
        }
    }while (pilih !=0)
}

fun tambah(a: Int, b:Int) = a+b;
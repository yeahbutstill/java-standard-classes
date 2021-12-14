# java-standard-classes

## String Class

- String yang pernah dibahas dimateri Java Dasar, String adalah object, artinya dia memiliki representasi class nya
- Ada banyak sekali method yang bisa kita gunakan di String, kita bisa melihat detail method apa saja yang tersedia
  dihalaman dokumentasi javadoc nya.

## Method di String Class

| Method                    | Keterangan                                   |
|---------------------------|----------------------------------------------|
| String toLowerCase()      | Membuat string baru dengan format lower case |
| String toUpperCase()      | Membuat string baru dengan format upper case |
| int length()              | Mendapatkan panjang string                   |
| boolean startsWith(value) | Mengecek apakah dimulai dengan string value  |
| boolean endsWith(value)   | Mengecek apakah diakhiri dengan string value |
| String[] split(value)     | Memotong string dengan string value          |

## StringBuffer dan StringBuilder Class

## Immutable String

- String adalah tipe data immutable, artinya tidak bisa berubah isinya, saat kita mengubah string, sebenarnya yang
  dilakukan di Java adalah membuar String baru.
- Jika kita ingin memanipulasi String dalam jumlah banyak, sangat tidak disarankan menggunakan String, karena akan
  memakan memory yang cukup besar, untuk kasus seperti ini, disarankan menggunakan StringBuffer atau StringBuilder

## StringBuffer vs StringBuilder

- Kemampuan StringBuffer dan StringBuilder cukup sama, bisa digunakan untuk memanipulasi String
- Yang membedakan adalah, StringBuffer itu Thread Safe, sedangkan StringBuilder tidak Thread Safe
- Jika kita ingin memanipulasi String secara paralel bersamaan, disarankan menggunakan StringBuffer, namun jika tidak
  butuh paralel, cukup gunakan StringBuilder
- Karena StringBuffer dibuat agar Thread Safe, maka secara otomatis performanya lebih lambat dibandingkan StringBuilder

## StringJoiner Class

- StringJoiner adalah class yang bisa digunakan untuk membuat String sequence yang dipisahkan dengan delimiter(pemisah)
- StringJoiner juga mendukung prefix(depan) dan suffix(belakang) jika kita ingin menambahkannya
- Ini sangat bagus ketika ada kasus misalnya kita ingin mem-print Array dengan format yang kita mau misalnya

## StringTokenizer Class

- StringTokenizer class adalah class yang bisa digunakan untuk memotong String menjadi token atau String yang lebih
  kecil
- Kita bisa memotong String dengan delimiter yang kita mau

## Nummber Class

- Semua number class yang bukan primitif memiliki parent class yang sama, yaitu class Number
- Class number memiliki banyak method yang bisa digunakan untuk mengkonversi ke tipe number lain
- Hal ini memudahkan kita untuk mengkonversi object number dari satu tipe ke tipe number lainnya

## Method di Number Class

| Method               | Keterangan                   |
|----------------------|------------------------------|
| byte byteValue()     | Mengubah menjadi tipe byte   |
| double doubleValue() | Mengubah menjadi tipe double |
| float floatValue()   | Mengubah menjadi tipe float  |
| int intValue()       | Mengubah menjadi int value   |
| long longValue()     | Mengubah menjadi long value  |
| short shortValue()   | Mengubah menjadi short value |

## Konversi String ke Number

- Long, Integer, Short dan Byte memiliki static method untuk melakukan konversi dari String ke Number
- parseXxx(string) digunakan untuk mengkonversi dari string ke tipe data number primitif
- valueOf(string) digunakan untuk mengkonversi dari string ke tipe data number non primitif
- Method ini akan throw NumberFormatException jika ternyata gagal melakukan konversi String ke Number

## Math Class

- Class Math merupakan class utilities yang berisikan banyak sekali static method untuk operasi numerik, seperti
  trigonometric, logarithm, akar pangkat dan lain-lain

## Mthod di Math Class

| Method                | Keterangan                      |
|-----------------------|---------------------------------|
| double cos(double)    | Menghitung cos di trigonometric |
| double sin(double)    | Menghitung sin di trigonometric |
| double tan(double)    | Menghitung tan di trigonometric |
| min(number1, number2) | Mengambil nilai terkecil        |
| max(number1, number2) | Mengambil nilai terbesar        |
| ...dan masih banyak   |         |

## Big Number

- Jika kita ada kebutuhan untuk menggunakan angkat yang besar sehingga melebihi kapasitas Long dan Double, di Java sudah
  disediakan class untuk handle data besar tersebut
- BigInteger adalah class untuk handle tipe data Integer, dan
- BigDecimal adalah class untuk handle tipe data floating point

## Method di BigInteger & BigDecimal

| Method                   | Operator |
|--------------------------|---------|
| add                      | +       |
| subtract                 | -       |
| multiply                 | *       |
| divide                   | /       |
| mod                      | %       |
| ...dan masih banyak lagi |         |

## Scanner Class

- Scanner sebenarnya bagian dari Java IO(Input Output), dan ini akan dibahas di materi terpisah
- Namun sekarang kita akan bahas sekilas tentang class Scanner
- Class Scanner hadir sejak Java 5
- Class Scanner adalah class yang bisa digunakan untuk membaca input,entah dari file, console dan lain-lain
- Class Scanner ini cocok untuk dijadikan object untuk membaca input user saat kita belajar membuat program java
  menggunakan console / terminal

## Method di Scanner Class

| Method              | Keterangan      |
|---------------------|-----------------|
| nextLine()          | Membaca string  |
| nextInt()           | Membaca int     |
| nextLong()          | Membaca long    |
| nextBoolean()       | Membaca boolean |
| ...dan masih banyak |                 |

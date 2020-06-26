open class searchFunction {


    fun searchIntSize(){
        println("Nilai size byte dari tipe data Int: ${Int.SIZE_BITS}")
    }
    fun searchLongSize(){
        println("Nilai size byte dari tipe data Long: ${Long.SIZE_BITS}")
    }
    fun searchFloatSize(){
        println("Nilai size byte dari tipe data Float: ${Float.fromBits(Int.SIZE_BITS)}")
    }
    fun searchOtherSize(){
        println("Nilai size byte dari Double dan String not found")
    }

    fun searchIntMin(){
        println("Nilai minimal dari tipe data Int: ${Int.MIN_VALUE}")
    }
    fun searchLongMin(){
        println("Nilai minimal dari tipe data Long: ${Long.MIN_VALUE}")
    }
    fun searchFloatMin(){
        println("Nilai minimal dari tipe data Float: ${Float.MIN_VALUE}")
    }
    fun searchDoubleMin(){
        println("Nilai minimal dari tipe data Double: ${Double.MIN_VALUE}")
    }
    fun searchStringMin(){
        println("Nilai minimal dari tipe data String: Not Found")
    }

    fun searchIntMax(){
        println("Nilai maximal dari tipe data Int: ${Int.MAX_VALUE}")
    }
    fun searchLongMax(){
        println("Nilai maximal dari tipe data Long: ${Long.MAX_VALUE}")
    }
    fun searchFloatMax(){
        println("Nilai maximal dari tipe data Float: ${Float.MAX_VALUE}")
    }
    fun searchDoubleMax(){
        println("Nilai maximal dari tipe data Double: ${Double.MAX_VALUE}")
    }
    fun searchStringMax(){
        println("Nilai maximal dari tipe data Long: Not Found")
    }

}
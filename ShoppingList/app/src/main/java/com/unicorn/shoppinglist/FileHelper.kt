package com.unicorn.shoppinglist

import android.content.Context
import java.io.*

class FileHelper {

    private val fileName = "shoppingList.dat"

    fun writeData(item: ArrayList<String>, context: Context){

        var fos: FileOutputStream = context.openFileOutput(fileName, Context.MODE_PRIVATE)

        var oos = ObjectOutputStream(fos)
        oos.writeObject(item)
        oos.close()

    }

    fun readData(context: Context): ArrayList<String> {

        var itemList: ArrayList<String>

        try {

            val fis: FileInputStream = context.openFileInput(fileName)
            var ois = ObjectInputStream(fis)
            itemList = ois.readObject() as ArrayList<String>

        } catch (e : FileNotFoundException) {

            itemList = ArrayList()

        }

        return itemList

    }

}
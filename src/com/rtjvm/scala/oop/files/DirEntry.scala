package com.rtjvm.scala.oop.files

abstract class DirEntry(val parentPath: String, val name: String) {

  def path: String = {
    val separatorIfNecessery =
      if (Directory.ROOT_PATH.equals(parentPath)) ""
      else Directory.SEPARATOR

    parentPath + separatorIfNecessery + name
  }

  def asDirectory: Directory
  def asFile: File
  def getType: String

  def isDirectory: Boolean
  def isFile: Boolean

}

package models

trait User{
  def calculate(num:Int):Int={
        //val dao = new UserDao
        //dao.calculateDao()
       55
    }
}

class UserDao{
  def calculateDao(num:Int):Int={
      return(num * num)
    }
}

object userObj extends User

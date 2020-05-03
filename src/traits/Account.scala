package traits

class Account {

}


object Account {
  def main(args: Array[String]): Unit = {
    val account = new Account with Logger;
    account.log("sss");
  }
}
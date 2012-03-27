package dojo.items

trait TimedItem {

  def ready(now:Int)

  def act(now:Int) : Option[Any]
  
  def startClock(now:Int)

}

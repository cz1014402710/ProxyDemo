package demo


/**
 * description: <一句话功能简述>
 *
 * @author Chenz
 * @date 2018/1/16 0016
 */
object ProxyTest {

    val p=ProxyPerson()

    @JvmStatic
    fun main(args: Array<String>) {
        p.doSomething()
    }
}
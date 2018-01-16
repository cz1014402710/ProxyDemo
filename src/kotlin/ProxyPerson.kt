package demo


/**
 * description: <一句话功能简述>
 *
 * @author Chenz
 * @date 2018/1/16 0016
 */
class ProxyPerson : Person {
    val p=ZhangSan()
    override fun doSomething() {
        p.doSomething()
    }


}
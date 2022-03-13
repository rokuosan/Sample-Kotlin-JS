import kotlinx.browser.document
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLHeadingElement

fun main(){
    val button1 = document.getElementById("btn-1") as HTMLButtonElement
    val field = document.getElementById("count") as HTMLHeadingElement
    val bar = document.getElementById("pb") as HTMLDivElement
    var count = 0

    button1.addEventListener("click", {
        // カウントを増やす
        if(count<100){
            count++
        }else{
            count=0
        }

        // 文字を変える
        "In progress: $count%".also {
            field.textContent=it
        }

        // 進捗を進める
        "$count%".also{
            bar.style.width=it
        }
    })
}
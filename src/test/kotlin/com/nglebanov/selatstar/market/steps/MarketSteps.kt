package com.nglebanov.selatstar.market.steps

import com.nglebanov.selatstar.core.base.BaseSteps
import com.nglebanov.selatstar.market.elements.MarketElementsFactory
import com.nglebanov.selatstar.market.elements.MarketNotebooksPage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MarketSteps : BaseSteps() {

    @Autowired
    lateinit var marketNotebooksPage: MarketNotebooksPage

    @Autowired
    lateinit var marketelms: MarketElementsFactory

    init {

        And("^открываем страницу ноутбуков маркета$") {
            //Selenide.open(marketNotebooksPage.url)
            marketelms.filter("Цена")

        }

        And("^сортируем ноутбуки по (новизне|отзывам|популярности|размеру скидки|рейтингу|цене)$") { sortRule: String ->
            when (sortRule) {
                //"новизне" -> marketNotebooksPage.Sorts().поНовизне.click()
                //"отзывам" -> marketNotebooksPage.Sorts().поОтзывам.click()
                //"популярности" -> marketNotebooksPage.Sorts().поПопулярности.click()
                //"размеру скидки" -> marketNotebooksPage.Sorts().поРазмеруСкидки.click()
                //"рейтингу" -> marketNotebooksPage.Sorts().поРейтингу.click()
                //"цене" -> marketNotebooksPage.Sorts().поЦене.click()
            }
        }
    }
}
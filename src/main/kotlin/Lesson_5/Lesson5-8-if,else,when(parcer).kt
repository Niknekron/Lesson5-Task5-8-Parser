package org.example.Lesson_5

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

fun main() {
    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()
    val qoutes = doc.select("article.sc-14uz67c-0 .sc-2aegk7-2.bzpNIu")
    for (qoute: Element in qoutes) {
        println(qoute.text())
        println("- - -")
    }
}
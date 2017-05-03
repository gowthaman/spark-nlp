package com.jsl.nlp.annotators

import com.jsl.nlp.{ContentProvider, DataBuilder}
import org.apache.spark.sql.{Dataset, Row}
import org.scalatest._

/**
  * Created by saif on 02/05/17.
  */
class RegexTokenizerTestSpec extends FlatSpec with RegexTokenizerBehaviors {

  /**
    * General RegexTokenizer tests here ...
    */

  // ....

  /**
    * Behavior tests here ...
    */

  val latinBodyData: Dataset[Row] = DataBuilder.basicDataBuild(ContentProvider.latinBody)

  "A full RegexTokenizer pipeline with latin content" should behave like fullTokenizerPipeline(latinBodyData)

}
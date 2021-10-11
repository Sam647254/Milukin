package ooo.trankvila.milukin

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class LexerSpec extends AnyFlatSpec, Matchers:
   "The lexer" should "be able to read pronouns" in {
      val mi = Lexer.processWord("mi")
      mi.get.partOfSpeech shouldBe PartOfSpeech.Pronoun

      val sina = Lexer.processWord("sina")
      sina.get.partOfSpeech shouldBe PartOfSpeech.Pronoun
   }

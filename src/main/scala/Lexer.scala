package ooo.trankvila.milukin

object Lexer:
   def processWord(input: String): Option[Word] =
      input match
         case "mi" | "sina" =>
            Some(Word(input, PartOfSpeech.Pronoun))
         case _ => None

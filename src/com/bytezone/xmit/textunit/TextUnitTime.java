package com.bytezone.xmit.textunit;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TextUnitTime extends TextUnitString
{
  static DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("yyyyMMddHHmmss");
  LocalDateTime dateTime;

  public TextUnitTime (byte[] buffer, int ptr)
  {
    super (buffer, ptr);

    dateTime = LocalDateTime.parse (text, formatter);
  }

  // ---------------------------------------------------------------------------------//
  // toString
  // ---------------------------------------------------------------------------------//

  @Override
  public String toString ()
  {
    return String.format ("%04X  %-8s  %s", keys[keyId], mnemonics[keyId], dateTime);
  }
}
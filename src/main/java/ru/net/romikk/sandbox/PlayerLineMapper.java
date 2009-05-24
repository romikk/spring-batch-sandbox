/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.net.romikk.sandbox;

import org.springframework.batch.item.file.LineMapper;
import ru.net.romikk.sandbox.entity.Player;

/**
 *
 * @author romikk
 */
public class PlayerLineMapper implements LineMapper<Player> {

    public Player mapLine(String line, int lineNumber) throws Exception {
        return new Player();
    }

}

# Divergent667
An open source 667 base.

Main features:
- Alot of easily configurable variables in Settings.java files
 - Quest system -- example quest Druidic ritual
 - Rewritten dialogue system for convinient dialogue writing
 - Rewritten Magic
 - Rewritten prayer (most bases don't have proper prayer draining)
 - Rewritten most packet handling
 - Action registeration system that lets you register actions from anywhere in your code.
 Actions include object actions, npc actions, player actions and command actions
 - Construction (pathing in a POH is broken and some rotations don't save correctly otherwise quite functional)
 - Server sided path correction (might be related to the above. It's more likely though that the objects are added in a way that the pathfinding doesn't recognize)
 -  An effect system for things like soulsplit, antifire etc.
 
Drawbacks:
- somewhat unfamiliar structure compared to other stuff. So if you can't read code you might want to stay away from this as most guides out there won't help you. 
- Unfinished stuff (mainly missing configs that basically just need to be typed out) 
- Custom client (a normal client might work if you disable RSA server sided)

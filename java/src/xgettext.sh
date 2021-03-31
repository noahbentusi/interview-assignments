#!/bin/bash
mkdir -f po

mvn i18n:gettext
node xgettext.js `find -name '*.jsp' -type f -o -name '*.java' -type f` > po/java.pot

rm po/keys.pot
msgcat `find -name '*.pot' -type f` > po/keys.pot

msgmerge -F ./modules/lang-pack/src/main/po/en.po po/keys.pot > po/en.po
msgmerge -F ./modules/lang-pack/src/main/po/zh_CN.po po/keys.pot > po/zh_CN.po
msgmerge -F ./modules/lang-pack/src/main/po/zh_TW.po po/keys.pot > po/zh_TW.po

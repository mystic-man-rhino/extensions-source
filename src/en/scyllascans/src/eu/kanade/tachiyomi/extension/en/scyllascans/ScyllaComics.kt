package eu.kanade.tachiyomi.extension.en.scyllascans

import eu.kanade.tachiyomi.multisrc.fuzzydoodle.FuzzyDoodle

class ScyllaComics : FuzzyDoodle("Scylla Comics", "https://scyllacomics.xyz", "en") {

    // readerfront -> fuzzydoodle
    override val versionId = 2

    override val latestFromHomePage = true
}

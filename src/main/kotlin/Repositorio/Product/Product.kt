package Repositorio.Product

import org.springframework.cglib.core.internal.Function
import org.springframework.cglib.core.internal.LoadingCache.IDENTITY
import kotlin.Any as KotlinAny


@Entity(table="products")
data class Product(
    var name: String,
    var price: Double,

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private var id: Long? = null
)

annotation class GeneratedValue(val strategy: Function<KotlinAny, KotlinAny>?)

annotation class Id

annotation class Entity(val table: String)
